package kodlamaio.dayNineLectureTwo.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;



import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.JobSeeker;




public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	Result save(JobSeeker jobSeeker) throws RemoteException;
	 
	boolean checkIdentityNumber(Long identityNumber);

}
