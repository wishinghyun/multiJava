package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class abplus {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < a; i++) {
			String str = br.readLine();
			String[] line = str.split(" ");
			String result = Integer.toString(Integer.parseInt(line[0])
			           +Integer.parseInt(line[1]));
			bw.write("Case #"+(i+1)+": "+result);
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
