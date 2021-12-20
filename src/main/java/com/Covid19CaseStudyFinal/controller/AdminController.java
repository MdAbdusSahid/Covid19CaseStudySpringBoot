package com.Covid19CaseStudyFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Covid19CaseStudyFinal.entity.Admin;
import com.Covid19CaseStudyFinal.entity.Appointment;
import com.Covid19CaseStudyFinal.entity.IdCard;
import com.Covid19CaseStudyFinal.entity.Member;
import com.Covid19CaseStudyFinal.entity.VaccinationCenter;
import com.Covid19CaseStudyFinal.entity.Vaccine;
import com.Covid19CaseStudyFinal.entity.VaccineCount;
import com.Covid19CaseStudyFinal.entity.VaccineInventory;
import com.Covid19CaseStudyFinal.entity.VaccineRegistration;
//import com.Covid19CaseStudyFinal.exception.BookingException;
//import com.Covid19CaseStudyFinal.exception.ControllerBookingException;
import com.Covid19CaseStudyFinal.service.AdminServiceImpl;
import com.Covid19CaseStudyFinal.service.AppointmentService;
import com.Covid19CaseStudyFinal.service.IdCardServiceItf;
import com.Covid19CaseStudyFinal.service.MemberserviceItf;
import com.Covid19CaseStudyFinal.service.VaccinationCenterService;
import com.Covid19CaseStudyFinal.service.VaccineCountService;
import com.Covid19CaseStudyFinal.service.VaccineInventoryService;
import com.Covid19CaseStudyFinal.service.VaccineRegistrationService;
import com.Covid19CaseStudyFinal.service.VaccineService;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	private AdminServiceImpl adminService;

	@Autowired
	private VaccineService vaccineService;

	@Autowired
	private VaccineCountService vaccineCountSrevice;

	@Autowired
	private AppointmentService appointmentService;

	@Autowired
	private IdCardServiceItf idCardServiceItf;

	@Autowired
	private MemberserviceItf memberserviceItf;

	@Autowired
	private VaccinationCenterService service;

	@Autowired
	private VaccineRegistrationService vaccineRegistrationService;
	
	@Autowired
	private VaccineInventoryService vaccineInventoryService;

	/*-----------------------------------------------------------------------------------------------------------------------*/

	@PostMapping("/insert")
	public Admin insertAdmin(@RequestBody Admin admin) {

		return adminService.insertAdmin(admin);
	}

	@PutMapping("/update")
	public Admin updateAdmin(@RequestBody Admin admin) {

		return adminService.updateAdmin(admin);
	}

	@GetMapping("/view")
	public List<Admin> getAdmin() {

		return adminService.getAdmin();

	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {

		adminService.deleteById(id);
	}

	/*----------------------------------------Vaccine------------------------------------------------------------------*/

	@PostMapping("/adminvaccineadd")
	private Vaccine addVaccine(@RequestBody Vaccine vaccine) {
		return vaccineService.addVaccine(vaccine);

	}

	@PutMapping("/adminvaccineupdate")
	private Vaccine updateVaccine(@RequestBody Vaccine vaccine) {
		return vaccineService.updateVaccine(vaccine);

	}

	@DeleteMapping("/adminvaccinedelete/{vaccineId}")
	private void deleteVaccine(@PathVariable Integer vaccineId) {
		vaccineService.deleteVaccineById(vaccineId);

	}

	@GetMapping("/adminvaccines")
	private List<Vaccine> getAllVaccine() {
		return vaccineService.getAllVaccine();
	}

	@GetMapping("/adminvaccines/{vaccineId}")
	private Vaccine findByVaccineId(@PathVariable Integer vaccineId) {
		return vaccineService.findByVaccineId(vaccineId);
	}

	/*----------------------------------------Vaccine Count------------------------------------------------------------------*/

	@GetMapping("/adminvaccinecount")
	public List<VaccineCount> getAllVaccine1() {
		return vaccineCountSrevice.getAllVaccine();
	}

	@GetMapping("/adminvaccineprice")
	public VaccineCount getPrice(@RequestBody Integer price) {
		return vaccineCountSrevice.getPrice(price);
	}

	@GetMapping("/adminvaccinequantity")
	public VaccineCount getQuantity(@RequestBody Integer quantity) {
		return vaccineCountSrevice.getQuantity(quantity);
	}

	@PostMapping("/adminvaccinecountadd")
	private VaccineCount addVaccine(@RequestBody VaccineCount vaccineCount) {
		vaccineCountSrevice.addVaccineCount(vaccineCount);
		return null;

	}

	/*----------------------------------------------Appointment--------------------------------------------------------------*/

	@PostMapping("/addapp")
	public Appointment addAppointment(@RequestBody Appointment app) {
		return appointmentService.addAppointment(app);
	}
	
	@PutMapping("/updateapp")
	public Appointment updateAppointment(@RequestBody Appointment app) {
		return appointmentService.updateAppointment(app);
	}

	@DeleteMapping("/deleteapp/{bookingid}")
	public void deleteAppointment(@PathVariable long bookingid) {
		appointmentService.deleteAppointment(bookingid);
	}

	@GetMapping("/getappointment/{bookingid}")
	public Appointment getAppointment(@PathVariable long bookingid) {
		return appointmentService.getAppointment(bookingid);
	}

	@GetMapping("/allappointment")
	public List<Appointment> getAllAppointment() {
		return appointmentService.getAllAppointment();
	}

	/*----------------------------------------------IdCard--------------------------------------------------------------*/

	@PostMapping("/addid")
	private IdCard addIdCard(@RequestBody IdCard idCard) {
		return idCardServiceItf.addIdCard(idCard);
	}

//	@GetMapping("/addid/panCard/{panNo}")
//	private IdCard getPanCardByNumber(@PathVariable("panNo") int panNo) {
//		return idCardServiceItf.getPanCardByNumber(panNo);
//	}
//
//	@GetMapping("/addid/adharCard/{adharNo}")
//	private IdCard getAdharCardByNumber(@PathVariable("adharNo") int adharNo) {
//		return idCardServiceItf.getAdharCardByNo(adharNo);
//
//	}

	/*----------------------------------------------Member--------------------------------------------------------------*/

	@PostMapping("/adminmember")
	public Member addMember(@RequestBody Member member) {
		return memberserviceItf.addMember(member);
	}

	@PutMapping("/adminmemberput/{id}")
	public Member updateMember(@PathVariable int id, @RequestBody Member member) {
		return memberserviceItf.updateMember(member);
	}

	@DeleteMapping("/adminmemberdelete/{id}")
	public boolean deleteMember(@PathVariable int id) {
		return memberserviceItf.deleteMember(id);
	}

	@GetMapping("/adminmemberidcard/{id}")
	private Member getMemberById(@PathVariable int id) {
		return memberserviceItf.getMemberById(id);
	}

	@GetMapping("/adminmemberadharcard/{adharNo}")
	private Member getMemberByAdharNo(@PathVariable int adharNo) {
		return memberserviceItf.getMemberByAdharNo(adharNo);
	}

	@GetMapping("/adminmemberpancard/{panNo}")
	private Member getMemberByPanNo(@PathVariable int panNo) {
		return memberserviceItf.getMemberByPanNo(panNo);
	}

	@GetMapping("/adminmemberallmember")
	private List<Member> getAllMember() {
		return memberserviceItf.getAllMember();
	}

	/*----------------------------------------------VaccineCenter--------------------------------------------------------------*/

	@PostMapping("/adminvcadd")
	public VaccinationCenter addVaccineCenter(@RequestBody VaccinationCenter center) {
		return service.addVaccineCenter(center);

	}

	@PutMapping("/adminvcupdate")
	public VaccinationCenter updateVaccineCenter(@RequestBody VaccinationCenter center) {
		return service.updateVaccineCenter(center);

	}

	@DeleteMapping("/adminvcdelete")
	public void deleteVaccineCenter(@PathVariable int code) {
		service.deleteVaccineCenter(code);

	}

	@GetMapping("/adminvccenters")
	public List<VaccinationCenter> getAllVaccineCenters() {
		return service.getAllVaccineCenters();

	}

	@GetMapping("adminvccenter/{code}")
	public VaccinationCenter getVaccineCenter(@PathVariable int code) {
		return service.getVaccineCenter(code);

	}

	/*----------------------------------------------Vaccine Registration----------------------------------------------------*/

	@PostMapping("/addvr")
	private VaccineRegistration addVaccineRegistration(@RequestBody VaccineRegistration vaccineRegistration) {

		return vaccineRegistrationService.addVaccineRegistration(vaccineRegistration);

	}

	@PutMapping("/updatevr")
	private VaccineRegistration updateVaccineRegistration(@RequestBody VaccineRegistration vaccineRegistration) {

		return vaccineRegistrationService.updateVaccineRegistration(vaccineRegistration);

	}

	@DeleteMapping("/delete/{mobileno}")
	private void deleteVaccineRegistration(@PathVariable long mobileno) {

		 vaccineRegistrationService.deleteVaccineRegistration(mobileno);
		
	}

	@GetMapping("/vaccineRegistration/{mobileno}")
	private VaccineRegistration getVaccineRegistration(@PathVariable long mobileno) {
		return vaccineRegistrationService.getVaccineRegistration(mobileno);
	}

	@GetMapping("/allvaccineRegistrations")
	private List<VaccineRegistration> getAllVaccineRegistration() {
		return vaccineRegistrationService.getAllVaccineRegistrations();
	}
	
	/*---------------------------------------------------Vaccine Inventory----------------------------------------------------*/
	
	
	@PostMapping("/adminviadd")
	public VaccineInventory addVaccineCount(@RequestBody VaccineInventory vaccineInventory) {
	return vaccineInventoryService.addVaccineInventory(vaccineInventory);


	}

	@PutMapping("/adminviupdate")
	public VaccineInventory updateVaccineInventory(@RequestBody VaccineInventory vaccineInventory) {
	return vaccineInventoryService.updateVaccineInventory(vaccineInventory);


	}
	@DeleteMapping("/adminvidelete/{id}")
	public void deleteVaccineInventory(@PathVariable int id) {
	vaccineInventoryService.deleteVaccineInventory(id);


	}
	@GetMapping("/adminvvivaccineInventory/{id}")
	public VaccineInventory getVaccineInventoryByCenter(@PathVariable int id) {
	return vaccineInventoryService.getVaccineInventoryByCenter(id);

	}
	@GetMapping("/adminvivaccineInventory")
	public List<VaccineInventory> getAllVaccineInventory(){
	return vaccineInventoryService.getAllVaccineInventory();
	}
}
