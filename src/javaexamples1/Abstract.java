package javaexamples1;
abstract class Bank {
abstract void debit();
abstract void credit();
}
class Hdfc extends Bank{
public void debit() {
System.out.println("Hdfc debit");
}
public void credit() {
System.out.println("Hdfc credit");
}
}
class Icici extends Bank{
public void debit() {
System.out.println("Icici debit");
}
public void credit() {
System.out.println("Icici credit");
}
}
public class Abstract {
public static void main(String args[]) {
    Hdfc hd = new Hdfc();
    hd.debit();
    hd.credit();
    Icici ic = new Icici();
    ic.debit();
    ic.credit();
}
}

