$('document').ready(function(){
      $('table #editButton').on('click',function(event){
            event.preventDefault();
            let href = $(this).attr('href');
            $.get(href, function(vehicle, status){
                $('#vehicleNameEdit').val(vehicle.name);
                $('#vehicleTypeEdit').val(vehicle.vehicletypeid);
                $('#txtVehicleNumberEdit').val(vehicle.vehicleNumber);
                $('#txtRegistrationDateEdit').val(vehicle.registrationDate);
                $('#txtAcquisitionDateEdit').val(vehicle.acquisitionDate);
                $('#txtDescriptionEdit').val(vehicle.description);
                $('#vehicleMakeEdit').val(vehicle.vehiclemakeid);
                $('#vehicleModelEdit').val(vehicle.vehiclemodelid);
                $('#locationEdit').val(vehicle.locationid);
                $('#txtPowerEdit').val(vehicle.power);
                $('#txtEmailEdit').val(vehicle.fuelCapacity);
                $('#txtRemarksEdit').val(vehicle.remarks);
                $('#employeeInChargeEdit').val(vehicle.employeeid);
                $('#vehicleStatusEdit').val(vehicle.vehiclestatusid);
                $('#fupImageEdit').val(vehicle.photo);

            });
             $('#editModal').modal();
      });
    $('table #detailsButton').on('click',function(event){
        event.preventDefault();

        let href = $(this).attr('href');
        $.get(href, function(vehicle, status){
            $('#txtIdEdit').val(vehicle.id);
            $('#txtNameEdit').val(vehicle.name);
            $('#txtDetailsEdit').val(vehicle.details);
            $('#txtWebsiteEdit').val(vehicle.website);
            $('#txtAddressEdit').val(vehicle.address);
            $('#ddlStateEdit').val(vehicle.stateid);
            $('#ddlCountryEdit').val(vehicle.countryid);
            $('#txtCityEdit').val(vehicle.city);
            $('#txtPhoneEdit').val(vehicle.phone);
            $('#txtMobileEdit').val(vehicle.mobile);
            $('#txtEmailEdit').val(vehicle.email);
        });
        $('#detailsModal').modal();
    });
      $('table #deleteButton').on('click', function(event){
        event.preventDefault();
            let href = $(this).attr('href');
            $('#confirmDeleteButton').attr('href',href);
            $('#deleteModal').modal();
      });
});



