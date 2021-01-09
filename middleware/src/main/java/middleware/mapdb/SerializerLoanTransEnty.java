package middleware.mapdb;

import com.alibaba.fastjson.JSON;
import org.jetbrains.annotations.NotNull;
import org.mapdb.DataInput2;
import org.mapdb.DataOutput2;
import org.mapdb.Serializer;

import java.io.IOException;

public class SerializerLoanTransEnty implements Serializer<LoanTransEnty> {
	@Override
	public void serialize(@NotNull DataOutput2 out, @NotNull LoanTransEnty value) throws IOException {
		out.writeUTF(JSON.toJSONString(value));
	}

	@Override
	public LoanTransEnty deserialize(@NotNull DataInput2 input, int available) throws IOException {
		return JSON.parseObject(input.readUTF(), LoanTransEnty.class);
	}
}
