$('document').ready(function(){
      $('table #editButton').on('click',function(event){
            event.preventDefault();

            // /countries/findById/?id=1
            let href = $(this).attr('href');
            $.get(href, function(location, status){
                 console.log(location);
                $('#idEdit').val(location.id);
                $('#cityEdit').val(location.city);
                $('#addressEdit').val(location.address);
                $('#countryEdit').val(location.countryid);
                $('#stateEdit').val(location.stateid);
                $('#descriptionEdit').val(location.description);
                $('#detailsEdit').val(location.details);

            });
             $('#editModal').modal();
      });

        $('table #detailsButton').on('click',function(event){
        event.preventDefault();

        // /countries/findById/?id=1
        let href = $(this).attr('href');
        $.get(href, function(location, status){

            $('#cityDetails').val(location.city);
            $('#addressDetails').val(location.address);
            $('#countryDetails').val(location.country.description);
            $('#stateDetails').val(location.state); // Error
            $('#stateDetails').attr("disabled", "on");
            $('#detailsDetails').val(location.details);
            $('#lastModifiedByDetails').val(location.lastModifiedBy);
            $('#lastModifiedDateDetails').val(location.lastModifiedDate.substr(0,19).replace("T"," "));

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



