package work.company.storage;

import work.company.exception.CompanyNotFoundException;
import work.company.models.Company;

public class CompanyStorage {

    private Company[] companies;
    private int size;

    public CompanyStorage(){
        companies = new Company[10];
    }

    public void addCompany(Company company){
        if (size == companies.length){
            extend();
        }
        for (int i = 0; i < size; i++) {
            if (company.getIdCompany().equals(companies[i].getIdCompany())){
                System.out.println("Id has been repeated, Please change Id !!!");
                return;
            }
        }
        companies[size++] = company;
    }

    private void extend() {
        Company[] tmp = new Company[companies.length+10];
        System.arraycopy(companies,0,tmp,0,size);
        companies = tmp;
    }

    public void print() {
        if (size != -1) {
            for (int i = 0; i < size; i++) {
                System.out.println(companies[i]);
            }
        }else {
            System.out.println("No company added");
        }
    }

    public Company getCompanyById(String idCompany) throws CompanyNotFoundException {
        for (int i = 0; i < size; i++) {
            if (companies[i].getIdCompany().equals(idCompany)){
                return companies[i];
            }
        }
        throw new CompanyNotFoundException("Company with " + idCompany + " id does not exist!!!");
    }

}
