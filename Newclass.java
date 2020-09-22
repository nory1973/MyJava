
//-encoding UTF-8をファイル名の前に付けてコンパイル(javac)
class Student{ 
//クラス定義Student
    String name = "sato"; 
//フィールドの定義　型String、name＝フィールド名
    public void calculateAvg(int math, int english){
//メソッド定義
        System.out.println((math + english)/2);
    }
}
//上記クラスを使うにはインスタンス化する  
public class Newclass{ 
    public static void main(String[] args){
    Student a001 = new Student(); 
//インスタンス化   
// Student：クラス名、a001：オブジェクト名
    a001.name = "sato";
    System.out.println(a001.name);
    }
}