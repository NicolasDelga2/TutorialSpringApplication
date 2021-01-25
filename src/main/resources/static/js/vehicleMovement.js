$('document').ready(function(){
      $('table #editButton').on('click',function(event){
            event.preventDefault();

            let href = $(this).attr('href');
            $.get(href, function(vehicleMovement, status){
                $('#idEdit').val(vehicleMovement.id);
                $('#vehicleEdit').val(vehicleMovement.vehicleid);
                $('#location1Edit').val(vehicleMovement.locationid1);
                $('#location2Edit').val(vehicleMovement.locationid2);

                let date1 = vehicleMovement.date1.substr(0,10);
                let date2 = vehicleMovement.date2.substr(0,10);

                $('#date1Edit').val(date1);
                $('#date2Edit').val(date1);
                $('#remarksEdit').val(vehicleMovement.remarks);
            });
             $('#editModal').modal();
      });
        $('table #detailsButton').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href');
        $.get(href, function(vehicleMovement, status){
            $('#idDetails').val(vehicleMovement.id);
            $('#vehicleDetails').val(vehicleMovement.vehicleid);
            $('#location1Details').val(vehicleMovement.locationid1);
            $('#location2Details').val(vehicleMovement.locationid2);

            let date1 = vehicleMovement.date1.substr(0,10);
            let date2 = vehicleMovement.date2.substr(0,10);

            $('#date1Details').val(date1);
            $('#date2Details').val(date1);
            $('#remarksDetails').val(vehicleMovement.remarks);
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



