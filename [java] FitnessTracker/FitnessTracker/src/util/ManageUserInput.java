package util;

import java.util.Scanner;

/**
 *
 * @author nguyen47tramy
 */
//class chứa các hàm để quản lý việc nhập xuất dữ liệu của người dùng
//hàm static, chỉ có một vùng ram, dùng cho mọi nơi
public class ManageUserInput {

    //đặt scanner là biến global - dùng lại nhiều lần
    private static Scanner sc = new Scanner(System.in);

    //Các vấn đề cần xử lý:    1. nhập outofbound; 
    //          2. bị lướt lệnh nhập chữ sau lệnh nhập số (rác trong buffer)
    //          3. nhập không đúng định dạng yêu cầu
    
    //mỗi lần yêu cầu nhập sẽ cần thông báo nhập khác nhau 
    //==> cho thành tham số inputMsg
    //==> tương tự tham số lỗi nhập errorMsg
    //==> KỸ THUẬT LẬP TRÌNH DI - DEPENDENCY INJECTION 
    
    //Lấy số nguyên (nhập rep, set,..)
    public static int getAnInteger(String inputMsg, String errorMsg) {
        
        //tạo biến để chứa dữ liệu người dùng nhập
        int n;

        //xử lý nếu dữ liệu nhập vào < 1 và không là số nguyên
        //yêu cầu người dùng nhập lại (lặp vô tận)
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                
                if (n < 1)
                    throw new Exception();
                return n;
            } catch (Exception e) {                    
                System.out.println(errorMsg);
            }
        }       
    }
    
    //Lấy số nguyên (để vận hành menu)
    public static int getAnInteger(String inputMsg, String errorMsg, 
                                    int lowerBound, int upperBound){
        //hứng dữ liệu
        int n;
        
        //xử lý lowerBound và upperBound
        //nếu lower nhập bị lớn hơn thì đổi chỗ
        if (lowerBound > upperBound) {
            int temp;
            temp = lowerBound;
            lowerBound = upperBound;
            upperBound = temp;
        }
        
        //xử lý việc nhập:
        //nhập trong một khoảng
        while (true) {
            try{
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                //lấy hết buffer
                if (n > upperBound || n < lowerBound )
                    throw new Exception();
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    
    //Lấy chuỗi khác rỗng (cho name, description)
    public static String getString(String inputMsg, String errorMsg){
        
        //hứng dữ liệu người dùng nhập
        String s;
        
        while (true){
            System.out.println(inputMsg);
            s = sc.nextLine();
            if ( s.length() == 0 || s.isEmpty())
                System.out.println(errorMsg);
            else    
                return s;
        }
    }
    
    //Lấy chuỗi theo định dạng cho trước (cho id)
    //dùng Regular Expression, dùng regex
    //vì chỉ dùng hàm cho việc lấy duy nhất một giá trị
    //==> đặt tên cụ thể
    public static String getId(String inputMsg, String errorMsg, String fomat){
        //hứng dữ liệu người dùng        
        String id;
        
        //tạo biến để so sánh
        boolean match; 
        
        //xử lý dữ liệu nhập, so sánh với fomat
        while (true){
            System.out.println(inputMsg);
            id = sc.nextLine().trim().toUpperCase();
            match = id.matches(fomat);
            if (id.length() == 0 || id.isEmpty() || match == false)
                System.out.println(errorMsg);
            else
                return id;
        }
    }
    
    //Lấy chuỗi theo định dạng cho trước (cho eqipmentNeeded)  
    //vì chỉ dùng hàm cho việc lấy eqipmentNeeded yes/none
    //==> đặt tên cụ thể và code cứng yes / none
    public static String getEqipmetNeeded(String inputMsg, String errorMsg){
        //hứng dữ liệu từ người dùng nhập
        String eqipmentNeeded;
        
        //xử lý nhập khác rỗng và là yes hoặc none
        while (true){
            System.out.println(inputMsg);
            eqipmentNeeded = sc.nextLine().trim().toLowerCase();
            if ( eqipmentNeeded.equals("yes") || eqipmentNeeded.equals("none"))
                return eqipmentNeeded;
            System.out.println(errorMsg);
        }
    }
    
    //TEST NHẬP DỮ LIỆU
    //Dùng hàm main() để test yêu cầu nhập
    public static void main(String[] args) {
        //getEqipmetNeeded("yes / none ?", "yes or none only");
        //getId("input id", "not correct, input again", "EX");
        getAnInteger("input an integer", "are you dumb?");
    }
}
