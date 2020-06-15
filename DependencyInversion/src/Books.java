public class Books implements Product{


    String serialNo;

    Books(String serialNo){
        this.serialNo = serialNo;
    }

    @Override
    public String getBill(){
        return serialNo + " books has been ordered";
    }

    @Override
    public void order() {
        System.out.println(getBill());
    }
}
