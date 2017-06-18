package com.sm.services.school.response;

import com.sm.models.CommonResponseModel;
import com.sm.services.school.response.data.SchoolDetailDataModel;

public class SchoolDeatilResponseWrapper extends CommonResponseModel {
	private SchoolDetailDataModel detailModel;

	public SchoolDetailDataModel getDetailModel() {
		return detailModel;
	}

	public void setDetailModel(SchoolDetailDataModel detailModel) {
		this.detailModel = detailModel;
	}

}
