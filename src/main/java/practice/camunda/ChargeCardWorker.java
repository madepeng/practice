package practice.camunda;

import org.camunda.bpm.client.ExternalTaskClient;

/**
 * @ClassName ChargeCardWorker
 * @Description TODO
 * @Author madepeng
 * @Date 2019/10/12 10:34
 * @Version 1.0
 */
public class ChargeCardWorker {

    public static void main(String[] args) {
        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://172.19.184.152:8080/engine-rest")
                .asyncResponseTimeout(10000) // long polling timeout
                .build();

        // subscribe to an external task topic as specified in the process
        client.subscribe("charge-card")
                .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
                .handler((externalTask, externalTaskService) -> {
                    // Put your business logic here

                    // Get a process variable
                    String item = (String) externalTask.getVariable("item");
                    Long amount = (Long) externalTask.getVariable("amount");
                    System.out.println("Charging credit card with an amount of '" + amount + "'€ for the item '" + item + "'...");

                    // Complete the task
                    externalTaskService.complete(externalTask);
                }).open();
    }
}