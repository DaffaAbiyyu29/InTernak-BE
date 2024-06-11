package id.ac.astra.polytechnic.internakbe.constant;

import id.ac.astra.polytechnic.internakbe.model.Province;

import java.util.List;

public class ProvinceConstant {
    public static List<Province> provinces;

    public static final String mNotFound = "User not found";
    public static final String mEmptyData = "No data available";
    public static final String mCreateSuccess = "Province created successfully";
    public static final String mCreateFailed = "Failed to create Province";
    public static final String mUpdateSuccess = "Province updated successfully";
    public static final String mUpdateFailed = "Failed to update Province";
    public static final String mDeleteSuccess = "Province deleted sucessfully";
    public static final String mDeleteFailed = "Failed to delete Province";
    public static final String qAllDataActive = "SELECT * FROM ms_user WHERE usr_status = ?1";

}
