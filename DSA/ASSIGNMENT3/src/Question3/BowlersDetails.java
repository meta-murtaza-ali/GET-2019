package Question3;

/**
 * @author Murtaza Ali
 *
 */
public class BowlersDetails {
	Object Bowlername;
	int Balls;
	
	/**
	 * @param bowlername
	 * @param balls
	 * store the bowler details
	 */
	public BowlersDetails(Object bowlername,int balls){
		this.Bowlername=bowlername;
		this.Balls=balls;
	}
	
	/**
	 * @return bowlername
	 */
	public Object getElement(){
		return Bowlername;
	}
	
	/**
	 * @return bowler balls
	 */
	public int getPriority(){
		return Balls;
	}
	
	/**
	 * @param set bowler balls
	 */
	public void setBowlerBall(int balls){
		this.Balls = balls;
	}

}
