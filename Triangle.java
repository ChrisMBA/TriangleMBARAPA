package Dessin;

public class Triangle{

    private Point pointa, pointb, pointc;

//Solution 1
public Triangle(pointa, pointb , pointc){
    pointa = A;
    pointb = B;
    pointc = C;

}

//Solution 2
public Triangle2(){
    pointa = new Point(12,8); 
    pointb = new Point(18,13);
    pointc = new Point(10,20);

}

public void affiche(){
    System.out.println("Triangle ABC");
    System.out.println("A:");pointa.affiche();
    System.out.println("B:");pointb.affiche();
    System.out.println("C:");pointc.affiche();
}
}