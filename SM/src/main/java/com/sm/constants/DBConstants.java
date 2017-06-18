package com.sm.constants;

public class DBConstants {

	public class StoredProcedure {

		//Login
		public static final String LOGIN_SP = "Login_SP";
		
		//Sign Up
		public static final String CREATE_SCHOOL_ACCOUNT_SP = "CreateSchoolAccount_SP";
		public static final String GET_SCHOOL_DETAIL_SP = "GetSchoolDetail_SP";
		
		//STAFF
		public static final String SF_BASIC_DATA_SP = "SF_InsertStaffDeatils_SP";
		public static final String SF_PROFESSIONAL_DATA_SP = "SF_InsertProfessionalDeatils_SP";
		public static final String SF_BANK_DATA_SP = "SF_InsertBanksDeatils_SP";
		public static final String SF_ADDRESS_DATA_SP = "SF_InsertAddressDeatils_SP";
		public static final String GET_STAFF_DATA_SP = "GetStaffDetail_SP";
		
		//Common
		public static final String SEARCH_SP = "Search_SP";
	}

	public class Mapping {

		public static final String SCHOOL_DETAIL = "SchoolDetailMapping";
	}

	public class Attributes {
		// sign in
		public static final String USER_NAME = "userId";
		public static final String PASSWORD = "pwd";
		public static final String ROLE_ID = "roleId";
		public static final String IP_ADDRESS = "ipAddress";
		public static final String COUNT = "count";
		
		//sign up
		
		public static final String SCHOOL_NAME = "schoolName";
		public static final String SCHOOL_CODE = "schoolCode";
		public static final String ADDRESS_LINE1 = "addressLine1";
		public static final String ADDRESS_LINE2 = "addressLine2";
		public static final String TOWN = "town";
		public static final String TALUK = "taluk";
		public static final String DISTRICT = "district";
		public static final String STATE = "state";
		public static final String PIN_CODE = "pinCode";
		public static final String SCHOOL_TYPE = "schoolTypeId";
		
		//staff
		
		public static final String EMPLOYEE_NAME = "employeeName";
		public static final String MIDDLE_NAME = "middleName";
		public static final String LAST_NAME = "lastName";
		public static final String MOTHER_NAME = "motherName";
		public static final String FATHER_NAME = "fatherName";
		public static final String MOTHER_TONGUE = "motherTongue";
		public static final String DOB = "dob";
		public static final String GENDER = "gender";
		public static final String PAN_NUMBER = "panNumber";
		public static final String ADHAR_ID = "adharId";
		public static final String VOTER_ID = "voterId";
		public static final String BLOOD_GROUP = "bloodGroup";
		public static final String HEIGHT = "height";
		public static final String CASTE = "caste";
		public static final String SUB_CASTE = "subCaste";
		public static final String IDENTIFICATION_MARK = "identificationMark";
		public static final String IS_PHYSICALLY_DIASBLED = "isPhysicallyDiasbled";

		public static final String STAFF_ID = "staffId";
		public static final String DESIGNATION = "designation";
		public static final String DATE_OF_JOINING = "dateOfJoining";
		public static final String DATE_OF_RETIREMENT = "dateOfRetirement";
		public static final String EMPLOYEEMENT_GROUP_ID = "employeementGroupId";
		public static final String SUBJECT_NAME = "subjectName";
		public static final String GRADE_PAY = "gradePay";
		public static final String PAY_SCALE = "payScale";
		public static final String DATE_OF_NEXT_INCREMENT = "dateOfNextIncrement";
		public static final String AMT_OF_INCREMENT = "amtOfIncrement";
		public static final String SERVICE_TYPE_ID = "serviceTypeId";
		public static final String EMPLOYEEMENT_TYPE_ID = "employeementTypeId";
		public static final String APPOINTMENT_DATE = "appointmentDate";
		
		public static final String BANK_NAME = "bankName";
		public static final String BRANCH_NAME = "branchName";
		public static final String BRANCH_CODE = "branchCode";
		public static final String MICR_NUM = "micrNum";
		public static final String IFSF_CODE = "IFSFCode";
		public static final String ACCOUNT_NUMBER = "accountNumber";
		
		public static final String HOUSE_NUMBER = "houseNumber";
		public static final String POST_OFFICE = "postOffice";
		public static final String EMAIL_ID = "emailId";
		public static final String ADDRESS_TYPE_ID = "addressTypeId";
		public static final String HOUSING_SCHEME_NAME = "housingSchemeName";
		public static final String MOBILE_NUMBER = "mobileNumber";
		public static final String LAND_LINE = "landLine";


		//search 
		public static final String SEARCH_TERMS = "searchTerms";
	}

}
