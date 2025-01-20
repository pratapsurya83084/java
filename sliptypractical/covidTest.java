
// custom exception  class create
class UserdefinedException extends Exception{
    public UserdefinedException(String message){
        super(message);
    }
}


class Patient {
    String name;
    int age;
    int oxygenLevel;
    int hcrtReport;

     Patient(String name, int age, int oxygenLevel, int hcrtReport) {
        this.name = name;
        this.age = age;
        this.oxygenLevel = oxygenLevel;
        this.hcrtReport = hcrtReport;
    }


    // check the oxy_leve >95% or hcfrepoort < 10 then throw exception
    void dispalaypatientDetail()throws UserdefinedException{
        if (oxygenLevel < 95 || hcrtReport > 10) {
            throw new UserdefinedException("patient is covid  positive , need to hospitalized");

        }else{
            System.out.println("patient are negative no need to hospitalized .\n "+"patient name : "+name+ "\n patient age : " + age +  " \n oxy_level :" +oxygenLevel+"\n hcrt_report : "+hcrtReport);
        }
    }
}

class covidTest {
    public static void main(String[] args) {

        Patient patient=new Patient("raj",29,98,9);
    
    
    try {
        patient.dispalaypatientDetail();
    } catch (Exception e) {
        System.out.println("Exception : "+ e.getMessage());
    }
    }
}