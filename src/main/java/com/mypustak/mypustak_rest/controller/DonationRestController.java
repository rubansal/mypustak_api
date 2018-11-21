package com.mypustak.mypustak_rest.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonationRestController {

    @Autowired
    private DonationRequestsRepository donationRequestsRepository;
    
    @Autowired
    private GetBooksRequestRepository getBooksRequestsRepository;
    
    @Autowired
    private GetUserRepository getUserRepository;
    
    @Autowired
    private UsersRepository usersRepository;
    
    @Autowired
    private StateRepository stateRepository;
    
    @Autowired
    private CityRepository cityRepository;

   
    
//    @PostMapping("/getUsers/{donor_id}/donation")
//    public DonationRequest createComment(@PathVariable (value = "donor_id") int donor_id,
//                                 @Valid @RequestBody DonationRequest donationRequest) {
//        return getUserRepository.findById(donor_id).map(getUserRequest -> {
//            donationRequest.setGetUserRequest(getUserRequest);
//            return donationRequestsRepository.save(donationRequest);
//        }).orElseThrow(() -> new ResourceNotFoundException("donor_id " + donor_id + " not found"));
//    }
    
//    @GetMapping("/getdonation/{donorId}")
//    public List<DonationRequest> getdonations(@PathVariable int donorId)
//    {
//    return donationRequestsRepository.findByDonorId(donorId);
//    }

   
    
    @GetMapping("/getbooks")
    public List<GetBooksRequest> getBooks()
    {
    return getBooksRequestsRepository.findAll();
    }
    
    @GetMapping("/getUsers")
    public List<GetUserRequest> getUsers()
    {
    	return getUserRepository.findAll();
    }
    
    
//    @PostMapping("/getUsers/{email}")
//    public Users createUsers(@RequestBody Users users, @PathVariable String email) {
//    	users.setEmail(email);
//    	int id=usersRepository.findTopByOrderByIdDesc().getId();
//    	users.setId(id+1);
//    	return usersRepository.save(users);
//    }
//    
//    @GetMapping("/getUsers/{id}")
//    private GetUserRequest getUserId(@PathVariable String id)
//    {
//    	GetUserRequest getUserRequest=null;
//    	Optional<GetUserRequest> getUserOptional=getUserRepository.findById(Integer.parseInt(id));
//    	if(getUserOptional.isPresent())
//    		getUserRequest=getUserOptional.get();
//		return getUserRequest;
//    	
//    }
    
    @GetMapping("/donation")
    public List<DonationRequest> getdonations()
    {
    return donationRequestsRepository.findAll();
    }
    
    @PostMapping("/donationpost/{donor_id}")
    public DonationRequest createDonationRequest(@RequestBody DonationRequest donationRequest, @PathVariable String donor_id) {
    	donationRequest.setDonor_id(donor_id);
    	int id=donationRequestsRepository.findTopByOrderByIdDesc().getId();
    	donationRequest.setId(id+1);
        DonationRequest savedDonationRequest = donationRequestsRepository.save(donationRequest);
        return savedDonationRequest;

    }
    
    @GetMapping("/getUsers/{email}")
    public Users getUsersByEmail(@PathVariable String email)
    {
    return usersRepository.findUsersByEmail(email);
    }
    
    @PostMapping("/userpost/{email}")
  public Users createUser(@RequestBody Users users, @PathVariable String email) {
      int id=usersRepository.findTopByOrderByIdDesc().getId();
      users.setId(id+1);
      users.setEmail(email);
      Users savedUsers = usersRepository.save(users);
      return savedUsers;

  }
    
    @GetMapping("/getState/{stateName}")
    public States getStates(@PathVariable String stateName) {
    	return stateRepository.findByStateName(stateName);
    }
    
    @GetMapping("/getCity/{stateId}")
    public List<Cities> getAllCitiesByStateId(@PathVariable int stateId){
    	return cityRepository.findByStateId(stateId);
    }


}
