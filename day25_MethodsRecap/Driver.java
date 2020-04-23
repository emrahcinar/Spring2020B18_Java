package day25_MethodsRecap;
/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "safari", "edge", "Opera"},
				then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above,
				the method should return "Invalid"
				APPLY SWITCH STATEMENTS
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */
public class Driver {

    public static void main(String[] args) {
        //getDriver1();       //argument is mandatory

        String str= getDriver1("ChRoMe");
        System.out.println(str);

        String str2=getDriver2("cHrOmE");
        System.out.println(str2);
    }

    public static String getDriver1(String browserName){



switch (browserName.toLowerCase()){     //"ChromE" toLowerCase()==>chrome
    case "chrome": return "Chrome Driver";

    case "firefox": return "FirefoxDriver";

    case "safari ": return "Safari";

    case "opera ": return "Opera ";

    case "edge ": return "Edge ";

    default: return "Invalid Driver";
}

    }

    public static String getDriver2(String browserName){
        browserName=browserName.toLowerCase();

        if (browserName.equals("chrome")){
            return " Chrome Driver";
        }else if (browserName.equals("firefox")){
           return "FireFox driver";
        }else if (browserName.equals("safari")){
           return "Safari";
        }else if (browserName.equals("edge")){
            return "Edge";
        }else if (browserName.equals("opera")){
           return "Opera";
        }else{
            return "Invalid Driver";
        }


    }

    public static String getDriver3(String browserName){

browserName=browserName.toLowerCase();

        browserName = browserName.toLowerCase();

        return  (browserName.equals("chrome"))? "Chrome Driver"

                :(browserName.equals("firefox"))? "Firefox Driver"

                :(browserName.equals("safari"))? "Safari Driver"

                :(browserName.equals("edge"))? "Edge Driver"

                :(browserName.equals("Opera"))?"Opera Driver" : "Invalid Driver" ;

    }


}
