
public class LotteryTicket {

	int[] ticket = new int[6];
	
	public void LotteryTickets(int[] numbers)
	{
		int[] Ticket = new int[6];
		for(int i=0 ; i<6 ; i++)
		{
			Ticket[i] = numbers[i];
		}
	}
	
	public void raffle(int[] winningnumbers)
	{
		int bingo=0;
		
		for(int i=0 ; i<6 ; i++)
		{ 
			for(int j = 0; j<6; j++){
				if(ticket[i]==winningnumbers[j]) 
				{
					System.out.println(ticket[i]);	
				}
			}
		}
	}
}
