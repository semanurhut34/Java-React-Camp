package kodlamaio.dayEightLectureOne.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;



import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.entities.concretes.JobSeeker;




public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	Result save(JobSeeker jobSeeker) throws RemoteException;
	 
	boolean checkIdentityNumber(Long identityNumber);

}
