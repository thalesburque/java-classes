package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> electionResult = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				String candidate = fields[0];
				int votes = Integer.parseInt(fields[1]);

				if (electionResult.containsKey(candidate)) {
					int countedVotes = electionResult.get(candidate);
					electionResult.put(candidate, countedVotes + votes);
				} else {
					electionResult.put(candidate, votes);
				}

				line = br.readLine();

			}

			for (String key : electionResult.keySet()) {
				System.out.println(key + " " + electionResult.get(key));		
			}

		} catch (IOException e) {
			e.printStackTrace();		
		} finally {
			sc.close();
		}
		
	}
}
