package chapter06;


/**
 * Escreva uma descrição da classe ExceptionExample4 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ExceptionExample4
{
    public void method1(){
        try {
            method2();
        }
        catch(ArithmeticException e){
            System.out.println("Method1() catches the error");
        }
    }
    
    public void method2(){
        method3();
    }
    
    public void method3() throws ArithmeticException {
        int x = 0;
        //does some useful work ...
        //but throws a built in arithmeticException.
        //Note we do not need the try catch block here.
        if (x == 0){
            throw new ArithmeticException("0 value");
        }
    }
}
