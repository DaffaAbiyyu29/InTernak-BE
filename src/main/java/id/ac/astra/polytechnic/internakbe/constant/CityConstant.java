package id.ac.astra.polytechnic.internakbe.constant;

import id.ac.astra.polytechnic.internakbe.model.City;

import java.util.List;

public class CityConstant {

    public static List<City> cities;

    public static final String mNotFound = "User not found";
    public static final String mEmptyData = "No data available";
    public static final String mCreateSuccess = "City created successfully";
    public static final String mCreateFailed = "Failed to create City";
    public static final String mUpdateSuccess = "City updated successfully";
    public static final String mUpdateFailed = "Failed to update City";
    public static final String mDeleteSuccess = "City deleted sucessfully";
    public static final String mDeleteFailed = "Failed to delete City";
    public static final String qAllDataActive = "SELECT * FROM ms_user WHERE usr_status = ?1";

}
