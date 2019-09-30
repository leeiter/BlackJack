package blackjackservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class blackjackserviceV1 {

	List<String> cardList;
	
	public void cardDeckList(String cardFileName) throws Exception {
		
		cardList = new ArrayList<String>();
		
		FileReader fileReader = new FileReader(cardFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] card = reader.split("");
			
			List<String> cards = Arrays.asList(card);
		
			for (int i = 0; i < cards.size(); i++) {

				Collections.shuffle(cards);
				System.out.println(cards);

			}
			
			if(reader.length() < 1) continue;
			
			cardList.add(reader);
		}
		buffer.close();
		fileReader.close();	
	}
	
	public void point() {
		
	}
	
	public void dealer() {
		
	}
	
	public void player() {
		
	}
	
	public void viewPlay() {
		
	}
	
}