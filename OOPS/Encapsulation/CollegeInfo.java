package oppsAssignments;

import java.util.ArrayList;
import java.util.List;

public class CollegeInfo {
    private String collegeName;
    private List<String> departmentNames;

    public String getCollegeName()
    {
        return collegeName;
    }

    public List<String> getDepartmentNames()
    {
        return departmentNames;
    }
    public void setCollegeName(String CollegeName)
    {
        this.collegeName = CollegeName;
    }

    public void setDepartmentNames(List<String> DepartmentNames)
    {
        this.departmentNames = DepartmentNames;
    }

    public static void main(String[] args) {
        //Creating collegeDetails object and setting its name as well departments
        CollegeInfo[] colleges = new CollegeInfo[5];

        colleges[0] = new CollegeInfo();
        colleges[0].setCollegeName("COEP");
        colleges[0].setDepartmentNames(new ArrayList<String>(List.of("CS", "EC", "BioTech","MECH")));

        colleges[1] = new CollegeInfo();
        colleges[1].setCollegeName("VNIT");
        colleges[1].setDepartmentNames(new ArrayList<String>(List.of("ECE", "IT", "CS","AUTO")));

        colleges[2] = new CollegeInfo();
        colleges[2].setCollegeName("VIT");
        colleges[2].setDepartmentNames(new ArrayList<String>(List.of("CS", "AERO","EEE")));

        colleges[3] = new CollegeInfo();
        colleges[3].setCollegeName("SSBT");
        colleges[3].setDepartmentNames(new ArrayList<String>(List.of("CS", "EC", "AERO", "EI","BIOTECH")));

        colleges[4] = new CollegeInfo();
        colleges[4].setCollegeName("FMS");
        colleges[4].setDepartmentNames(new ArrayList<String>(List.of("ECE","AERO")));

        for (int i = 0; i < 5; i++)
        {
            System.out.println("College Name: " + colleges[i].getCollegeName());
            System.out.println("Departments:");

            for (int j = 0; j < colleges[i].departmentNames.size(); j++)
            {
                System.out.println(colleges[i].getDepartmentNames().get(j));
            }
        }
    }
}

