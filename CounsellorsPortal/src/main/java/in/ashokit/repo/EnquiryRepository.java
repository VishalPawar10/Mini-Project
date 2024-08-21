package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Enquiry;
import in.ashokit.entity.Counsellors;


public interface EnquiryRepository extends JpaRepository<Enquiry, Integer>{

	@Query(value = "select * from Enquiry_tbl where counsellor_id = :counsellorId", nativeQuery = true)
	public List<Enquiry> getByCounsellorId(Integer counsellorId);
	
	public List<Enquiry> findByEnqStatus(String status);
	
	
	
}
