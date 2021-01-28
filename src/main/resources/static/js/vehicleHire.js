$('document').ready(function(){
      $('table #editButton').on('click',function(event){
            event.preventDefault();
            let href = $(this).attr('href');
            $.get(href, function(vehicleHire, status){
                 console.log(vehicleHire);
                $('#idEdit').val(vehicleHire.id);
                $('#vehicleEdit').val(vehicleHire.vehicleid);
                $('#locationEdit').val(vehicleHire.locationid);
                $('#clientEdit').val(vehicleHire.clientid);

                let datein = vehicleHire.dateIn.substr(0,10);
                $('#dateInEdit').val(datein);

                let dateout = vehicleHire.dateOut.substr(0,10);
                $('#dateOutEdit').val(dateout);
                $('#remarksEdit').val(vehicleHire.remarks);
                $('#priceEdit').val(vehicleHire.price);

            });
             $('#editModal').modal();
      });
        $('table #detailsButton').on('click',function(event){
        event.preventDefault();

        // /countries/findById/?id=1
        let href = $(this).attr('href');
        $.get(href, function(vehicleHire, status){

            $('#idDetails').val(vehicleHire.id);
            $('#vehicleDetails').val(vehicleHire.vehicleid);
            $('#locationDetails').val(vehicleHire.locationid);
            $('#clientDetails').val(vehicleHire.clientid);

            let datein = vehicleHire.dateIn.substr(0,10);
            $('#dateInDetails').val(datein);

            let dateout = vehicleHire.dateOut.substr(0,10);
            $('#dateOutDetails').val(dateout);

            $('#remarksDetails').val(vehicleHire.remarks);
            $('#priceDetails').val(vehicleHire.price);
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



