/**
 * 
 */

 $('document').ready(function(){
	 	
	$('.table .btn-warning').on('click',function(event){
		
		event.preventDefault();
		
		var href = $(this).attr('href');
		
		$.get(href, function(student, status){
			$('#IdEdit').val(student.id);
			$('#departmentEdit').val(student.department);
			$('#nameEdit').val(student.name);
		    $('#updatedByEdit').val(student.updated_by);
			$('#updatedOnEdit').val(student.updated_on);
			
		});
		
		$('#editModal').modal();				
	});
	
	$('.table #deleteButton').on('click',function(event){
		
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href)
		$('#deleteModal').modal();
	});
});