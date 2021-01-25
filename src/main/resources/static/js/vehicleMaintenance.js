$('document').ready(function(){
      $('table #editButton').on('click',function(event){
            event.preventDefault();
            let href = $(this).attr('href');
            $.get(href, function(vehicleMaintenance, status){
                $('#idEdit').val(vehicleMaintenance.id);
                $('#vehicleEdit').val(vehicleMaintenance.vehicleid);
                let dateStart = vehicleMaintenance.startDate.substr(0,10);
                $('#dateEdit').val(dateStart);
                $('#remarksEdit').val(vehicleMaintenance.remarks);
                let dateEnd = vehicleMaintenance.endDate.substr(0,10);
                $('#endDateEdit').val(dateEnd);
                $('#supplierEdit').val(vehicleMaintenance.supplierid);
                $('#priceEdit').val(vehicleMaintenance.price);
            });
             $('#editModal').modal();
      });
        $('table #detailsButton').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href');
        $.get(href, function(vehicleMaintenance, status){

            $('#idDetails').val(vehicleMaintenance.id);
            $('#vehicleDetails').val(vehicleMaintenance.vehicleid);
            let dateStart = vehicleMaintenance.startDate.substr(0,10);
            $('#dateDetails').val(dateStart);
            $('#remarksDetails').val(vehicleMaintenance.remarks);
            let dateEnd = vehicleMaintenance.endDate.substr(0,10);
            $('#endDateDetails').val(dateEnd);
            $('#supplierDetails').val(vehicleMaintenance.supplierid);
            $('#priceDetails').val(vehicleMaintenance.price);
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



