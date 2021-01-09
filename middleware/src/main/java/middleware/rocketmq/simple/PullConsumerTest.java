/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package middleware.rocketmq.simple;

import org.apache.rocketmq.client.consumer.DefaultMQPullConsumer;
import org.apache.rocketmq.client.consumer.PullResult;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageQueue;

public class PullConsumerTest {
    public static void main(String[] args) throws MQClientException {
        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer("MCP_D_FORE_OCCUPY_COUPON");
        consumer.setNamesrvAddr("172.20.0.196:9876;172.20.0.197:9876;172.20.0.198:9876");

        consumer.start();

        try {
            MessageQueue mq = new MessageQueue();
            mq.setQueueId(14);
            mq.setTopic("MCP_D_FORE_OCCUPY_COUPON");
            mq.setBrokerName("broker-b");

            long offset = 3;

            long beginTime = System.currentTimeMillis();
            PullResult pullResult = consumer.pullBlockIfNotFound(mq, null, offset, 32);
            System.out.printf("%s%n", System.currentTimeMillis() - beginTime);
            System.out.printf("%s%n", pullResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

        consumer.shutdown();
    }
}
