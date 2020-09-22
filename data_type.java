//java data type
//int---byte,short,int,long(L)
//
//少数---float(F), double
//
//moji---char,String
//
//bool---true,false
//
//
//
//

class Data_type{

    public static void main(String[] args){

        byte var01 = 1;
        short var02 = 12345;
        int var03 = 1234567890;
        long var04 = 123456789000L;

        double var05 = 1.23456789;
        float var06 = 1.234F;
        
        char var07 = 'c';
        String var08 = "hello,world!";

        boolean var_bool1,var_bool2;

        var_bool1 = (var01 > var02);
        var_bool2 = (var01 < var02);

        System.out.println(var01);
        System.out.println(var02);
        System.out.println(var03);
        System.out.println(var04);

        System.out.println(var05);
        System.out.println(var06);

        System.out.println(var07);
        System.out.println(var08);

        System.out.println(var_bool1);
        System.out.println(var_bool2);

    }
}
