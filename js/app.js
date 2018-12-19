function createTable() {
	 
	divTable = $('<div></div>').attr({ class: "table-scroll" });
	mytable = $('<table></table>').attr({ id: "basicTable" , class: "table table-hover"});
	mytable.appendTo(divTable);
	var rows = new Number($("#rowcount").val());
	var cols = new Number($("#columncount").val());
	var tr = [];
	for (var i = 0; i < rows; i++) {
		var row = $('<tr></tr>').attr({ class: ["class1", "class2", "class3"].join(' ') }).appendTo(mytable);
		for (var j = 0; j < cols; j++) {
			col1 = $('<td></td>');
			col1.html(createTableElement());
			col1.appendTo(row);

		}
		 		 
	}
	
	console.log("TTTTT:"+divTable.html());
	divTable.appendTo("#box");	       
  
};

function writeComment() {
	console.log("Write");
};

function createTableElement() {

  tableElement ='<div class="card"><div class="card-header"><div class="row"><div class="col-lg-6"><label>' +$('#iName').val()+'</label></div></div></div><div class="card-body"><div class="row"><div class="col-lg-6"><label>'+$('#iMail').val()+'</label></div></div><div class="row"><div class="col-lg-6"><label>'+$('#iComment').val()+'</label></div></div></div></div>';



  return tableElement;
};