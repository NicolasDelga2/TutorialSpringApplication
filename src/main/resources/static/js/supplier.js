$('document').ready(function(){
      $('table #editButton').on('click',function(event){
            event.preventDefault();

            let href = $(this).attr('href');
            $.get(href, function(supplier, status){
                $('#txtIdEdit').val(supplier.id);
                $('#txtNameEdit').val(supplier.name);
                $('#txtDetailsEdit').val(supplier.details);
                $('#txtWebsiteEdit').val(supplier.website);
                $('#txtAddressEdit').val(supplier.address);
                $('#ddlStateEdit').val(supplier.stateid);
                $('#ddlCountryEdit').val(supplier.countryid);
                $('#txtCityEdit').val(supplier.city);
                $('#txtPhoneEdit').val(supplier.phone);
                $('#txtMobileEdit').val(supplier.mobile);
                $('#txtEmailEdit').val(supplier.email);
            });
             $('#editModal').modal();
      });

    $('table #detailsButton').on('click',function(event){
        event.preventDefault();

        let href = $(this).attr('href');
        $.get(href, function(supplier, status){
            $('#IdEditDetails').val(supplier.id);
            $('#NameEditDetails').val(supplier.name);
            $('#DetailsEditDetails').val(supplier.details);
            $('#WebsiteEditDetails').val(supplier.website);
            $('#AddressEditDetails').val(supplier.address);
            $('#ddlStateEditDetails').val(supplier.stateid);
            $('#ddlCountryEditDetails').val(supplier.countryid);
            $('#CityEditDetails').val(supplier.city);
            $('#PhoneEditDetails').val(supplier.phone);
            $('#MobileEditDetails').val(supplier.mobile);
            $('#EmailEditDetails').val(supplier.email);
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



