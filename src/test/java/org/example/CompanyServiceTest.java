/*
package org.example;

import org.example.bean.CompanyManager;
import org.example.model.Company;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class CompanyServiceTest {

    @Inject
    private CompanyManager companyManager;

    @PersistenceContext
    private EntityManager em;

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClasses(CompanyManager.class, Company.class)
                .addAsManifestResource("META-INF/persistence-test.xml", "persistence.xml");
    }

    private Long companyId;

    @Before
    public void setUp() {
        // Initialize data here
        Company company = new Company();
        company.setName("Initial Company");
        em.persist(company);
        em.flush(); // Ensure ID is assigned
        companyId = company.getId();
    }

    @Test
    public void testAddCompany() {
        Company newCompany = new Company();
        newCompany.setName("New Company");
        companyManager.addCompany(newCompany);
        assertNotNull(newCompany.getId());
    }

    @Test
    public void testGetAllCompanies() {
        List<Company> companies = companyManager.getAllCompanies();
        assertFalse(companies.isEmpty());
        assertTrue(companies.stream().anyMatch(c -> c.getId().equals(companyId)));
    }

    @Test
    public void testUpdateCompany() {
        Company company = em.find(Company.class, companyId);
        company.setName("Updated Company");
        Company updated = companyManager.updateCompany(company);
        assertEquals("Updated Company", updated.getName());
    }

    @Test
    public void testDeleteCompany() {
        companyManager.deleteCompany(companyId);
        Company company = em.find(Company.class, companyId);
        assertNull(company);
    }
}
*/
