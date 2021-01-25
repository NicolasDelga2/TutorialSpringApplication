$('document').ready(function(){
      $('table #editButton').on('click',function(event){
            event.preventDefault();
            let href = $(this).attr('href');
            $.get(href, function(contact, status){
                $('#idEdit').val(contact.id);
                $('#firstnameEdit').val(contact.firstname);
                $('#lastnameEdit').val(contact.lastname);
                $('#phoneEdit').val(contact.phone);
                $('#emailEdit').val(contact.email);
                $('#mobileEdit').val(contact.mobile);
                $('#remarksEdit').val(contacts.remarks);
            });
             $('#editModal').modal();
      });
        $('table #detailsButton').on('click',function(event){
        event.preventDefault();
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



