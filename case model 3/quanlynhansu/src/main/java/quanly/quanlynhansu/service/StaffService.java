package quanly.quanlynhansu.service;

import quanly.quanlynhansu.model.entity.Staff;
import quanly.quanlynhansu.model.dao.StaffDao;
import quanly.quanlynhansu.model.dto.StaffDto;

import java.util.LinkedList;
import java.util.List;

public class StaffService {
    private StaffDao staffDao = null;

    public StaffService() {
        staffDao = new StaffDao();
    }

    public List<StaffDto> findAll() {
       return staffDao.getAll();
    }

    public StaffDto find(int id) {
        return staffDao.get(id);
    }

    public void add(StaffDto staffDto) {
        StaffDto newStaff = new StaffDto(staffDto.getId(),
                staffDto.getName(),staffDto.getAddress(),
                staffDto.getPhone(),staffDto.getPosition(),
                staffDto.getStartDate(),staffDto.getSalary()
               );
        staffDao.insert(newStaff);


    }
    public List<StaffDto> searchByName(String name) {
        List<StaffDto> staffs = staffDao.searchByName(name);
        List<StaffDto> staffDtos = new LinkedList<>();
        for (StaffDto staff1 : staffs) {
            staffDtos.add(new StaffDto(staff1.getId(), staff1.getName(), staff1.getAddress(), staff1.getPhone(), staff1.getPosition(), staff1.getStartDate(),staff1.getSalary()));
        }
        return staffDtos;
    }
    public List<StaffDto> sortByIdDesc() {
        List<StaffDto> staffs = staffDao.sortByIdDesc();
        List<StaffDto> staffDtos = new LinkedList<>();
        for (StaffDto staff1 : staffs) {
            staffDtos.add(new StaffDto(staff1.getId(), staff1.getName(), staff1.getAddress(), staff1.getPhone(), staff1.getPosition(), staff1.getStartDate(),staff1.getSalary()));
        }
        return staffDtos;
    }

    public void edit(StaffDto staffDto) {
        StaffDto newStaff = new StaffDto(staffDto.getId(),
                staffDto.getName(),staffDto.getAddress(),
                staffDto.getPhone(),staffDto.getPosition(),
                staffDto.getStartDate(),staffDto.getSalary());
        staffDao.update(newStaff);
    }

    public void remove(int id) {
        staffDao.delete(id);
    }
}
