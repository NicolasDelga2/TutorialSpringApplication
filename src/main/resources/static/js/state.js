$('document').ready(function(){
      $('table #editButton').on('click',function(event){
            event.preventDefault();

            // /countries/findById/?id=1
            let href = $(this).attr('href');
            $.get(href, function(state, status){
                    console.log(state);
                $('#idEdit').val(state.id);
                $('#ddlCountryEdit').val(state.countryId);
                $('#nameEdit').val(state.name);
                $('#capitalEdit').val(state.capital);
                $('#codeEdit').val(state.code);
                $('#detailsEdit').val(state.details);

            });

             $('#editModal').modal();

      });

         $('table #detailsButton').on('click',function(event){
                  event.preventDefault();

                  // /countries/findById/?id=1
                  let href = $(this).attr('href');
                  $.get(href, function(state, status){

                      $('#idDetails').val(state.id);
                      $('#ddlCountryDetails').val(state.country.description);
                      $('#nameDetails').val(state.name);
                      $('#detailsDetails').val(state.details);
                      $('#lastModifiedByDetails').val(state.lastModifiedBy);
                     //$('#lastModifiedDateDetails').val(state.lastModifiedDate.substr(0,19).replace("T", " "));


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



