package com.oops.day2;

abstract class Department {
    public abstract int getDepartmentSize();
}

 class SubDepartment extends Department {
    private int departmentSize;

    public SubDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }
}


