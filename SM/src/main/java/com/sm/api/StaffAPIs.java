
package com.sm.api;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.sm.models.CommonResponseModel;
import com.sm.services.staff.StaffUtils;
import com.sm.services.staff.models.StaffAddressDetails;
import com.sm.services.staff.models.StaffBankDetails;
import com.sm.services.staff.models.StaffBasicDetails;
import com.sm.services.staff.models.StaffProfessionalDetails;

@Path("/staff")
@Produces(MediaType.APPLICATION_JSON)
public class StaffAPIs {

	@POST
	@Path("/personal")
	public CommonResponseModel saveBasicInfoOfStaff(StaffBasicDetails staffDetails, @Context HttpServletRequest request) {
		return new StaffUtils().saveBasicInfoOfStaff(staffDetails, request);
	}
	@POST
	@Path("/professional")
	public CommonResponseModel saveProfessionalDetailsOfStaff(StaffProfessionalDetails professionalDetails, @Context HttpServletRequest request) {
		return new StaffUtils().saveProfessionalDetailsOfStaff(professionalDetails, request);
	}
	
	@POST
	@Path("/bank")
	public CommonResponseModel saveBankDetailsOfStaff(StaffBankDetails bankDetails, @Context HttpServletRequest request) {
		return new StaffUtils().saveBankDetailsOfStaff(bankDetails, request);
	}
	
	@POST
	@Path("/address")
	public CommonResponseModel saveAddressDetailsOfStaff(StaffAddressDetails addressDetails, @Context HttpServletRequest request) {
		return new StaffUtils().saveAddressDetailsOfStaff(addressDetails, request);
	}
	
	@GET
	@Path("/getStaffDetails/{staffId}")
	public CommonResponseModel getStaffDetails(@PathParam("staffId") String staffId) {
		return new StaffUtils().getStaffDetails(staffId);
	}
}
