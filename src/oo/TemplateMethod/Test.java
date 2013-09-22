package oo.TemplateMethod;

/**
 *  A test client
 */
public class Test  {
    public static void main(String[] args) {
        // You should change the path of "test.txt" in your local machine
        String fileName = "F:\\Android\\work\\DesignPatterns\\src\\oo\\TemplateMethod\\test.txt";
        String url = "http://www.baidu.com/index.html";
        
        AbstractRead fileRead = new ReadFile();
        AbstractRead htmlRead = new ReadHtml();

        fileRead.setResource(fileName);
        htmlRead.setResource(url);
        
        System.out.println("-----  Read from a file  -----");        
        fileRead.getContent();
        System.out.println("-----  Read from a url  -----");
        htmlRead.getContent();
    }
}