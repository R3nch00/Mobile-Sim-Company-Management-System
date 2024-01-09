package interfaces;
import java.lang.*;
import classes.Sim;

public interface SimOperations{

	boolean insertSim(Sim s);
	boolean removeSim(Sim s);
	Sim searchSim(String simNumber);
	void showAllSims();
	
}