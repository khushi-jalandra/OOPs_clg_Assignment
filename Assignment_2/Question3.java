package Assignment_2;

class ITCompany
{
	String cmpName;
	String add;
	String city;
	Long contact;

	ITCompany (String cNm,String ad,String cit,Long cont)
	{
		cmpName=cNm;
		add=ad;
		city=cit;
		contact=cont;
        System.out.println(cmpName+"  "+add+"  "+city+"  "+contact);
	}
}

public class Question3 {
    public static void main(String[] args) {
        new ITCompany("wipro","ndr","pune",7342963L);
    }
}
