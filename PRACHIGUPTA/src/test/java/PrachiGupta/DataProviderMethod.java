package PrachiGupta;

public class DataProviderMethod {
	
	
	     //India Qutub minar
		 //Agra TjMahal 
		 //Hydrabad Charminar
	@org.testng.annotations.DataProvider(name = "searchDataSet")
	public Object[][] searchData()
	{
		Object[][] searchkeyword =new Object[3][2];
   
		searchkeyword[0][0]= "Delhi";
		searchkeyword[0][1]= "QutubMinar";
	
	
		searchkeyword[1][0]= "Agra";
		searchkeyword[1][1]= "TajMAhal";
		
		searchkeyword[2][0]= "Hydrabad";
		searchkeyword[2][1]= "Charminar";
		return searchkeyword;
	}
	

}
