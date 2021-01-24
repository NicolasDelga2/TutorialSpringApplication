$('document').ready(function(){
      $('table #editButton').on('click',function(event){
            event.preventDefault();
            // /countries/findById/?id=1
            let href = $(this).attr('href');
            $.get(href, function(vehicleMake, status){
                $('#idEdit').val(vehicleMake.id);
                $('#descriptionEdit').val(vehicleMake.description);
                $('#detailsEdit').val(vehicleMake.details);
            });
             $('#editModal').modal();
      });
        $('table #detailsButton').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href');
        $.get(href, function(vehicleMake, status){
            $('#descriptionDetails').val(vehicleMake.description);
            $('#detailsDetails').val(vehicleMake.details);
            $('#lastModifiedByDetails').val(vehicleMake.lastModifiedBy);
            $('#lastModifiedDateDetails').val(vehicleMake.lastModifiedDate.substr(0,19).replace("T"," "));
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


