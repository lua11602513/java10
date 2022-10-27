/**
 * 
 */
package java10;
class Caaa{
	private int num;
	public Caaa(){
		this(2); // ©I¥s Caaa(int n)«Øºc¤¸
}
public Caaa(int n){
	num=n;
}
public int get(){
	return num;
}
 }
class Cbbb extends Caaa{
	public void show(){
		System.out.println("num="+get());
}
 }
public class class05{
	 public static void main(String args[]){
		 Cbbb bb=new Cbbb();
		 bb.show();
}
 } 