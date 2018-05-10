package ComboLocker;
/**
 * Christopher Duong 
 *U3A2 ComboLock
 *This Is the Combo lock Object
 */
public class ComboLock {
	int numb1=0,numb2=0,numb3=0;
	public ComboLock(){
		numb1=0;
		numb2=0;
		numb3=0;
	}//end default combo lock
	public int getNumb1(){
		return numb1;
	}//end get numb1
	public void setNumb1(int l){
		numb1=l;
	}//end set numb1
	public int getNumb2(){
		return numb2;
	}//end get numb2
	public void setNumb2(int l){
		numb2=l;
	}//end set numb2
	public int getNumb3(){
		return numb3;
	}//end get numb3
	public void setNumb3(int l){
		numb3=l;
	}//end set numb3
	public void randomizeLock() {
		numb1=(int) Math.random()*2+1;
		numb2=(int) Math.random()*2+1;
		numb3=(int) Math.random()*2+1;
	}//end randomize lock
}//end class
