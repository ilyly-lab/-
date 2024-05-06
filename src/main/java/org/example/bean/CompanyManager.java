package org.example.bean;

import org.example.model.Company;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class CompanyManager {
    @PersistenceContext
    private EntityManager em;

    public void addCompany(Company company) {
        em.persist(company);
    }

    // Другие методы управления данными
    // Read (all companies)
    /*public List<Company> getAllCompanies() {
        TypedQuery<Company> query = em.createQuery("SELECT c FROM Company c", Company.class);
        return query.getResultList();
    }*/

    // Update
    public Company updateCompany(Company company) {
        return em.merge(company);
    }

    // Delete
    public void deleteCompany(Long id) {
        Company company = em.find(Company.class, id);
        if (company != null) {
            em.remove(company);
        }
    }

    public static void main(String[] args) {
        CompanyManager companyManager = new CompanyManager();
        companyManager.addCompany(new Company(44L,"dd,","ff",null,null));
    }
}