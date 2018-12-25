var data = [];


function loadData() {

    $('#box').html("");
    createTable(data.length/3  ,3);

	for(let i = 0; i < data.length; i++) {
        document.getElementById('cell_' + i)
			.value = createTableElement(data[i]);
	}
};

function saveComment() {

	data.push({
		name: $('#iName').val(),
		email: $('#iMail').val(),
		comment: $('#iComment').val(),
	});

	console.log(data);
    clearInputFields();
	loadData();
};

function clearInputFields() {
    $('#iName').val("");
    $('#iMail').val("");
    $('#iComment').val("");
};



function createTable(rows, cols) {
	 
	divTable = $('<div></div>').attr({ class: "table-scroll" });
	mytable = $('<table></table>').attr({ id: "basicTable" , class: "table table-hover"});
	mytable.appendTo(divTable);
	let cellId = 0;
	var tr = [];
	for (var i = 0; i < rows; i++) {
		var row = $('<tr></tr>').attr({ class: ["class1", "class2", "class3"].join(' ') }).appendTo(mytable);
		for (var j = 0; j < cols; j++) {
			col1 = $('<td></td>').attr({ id: "cell_" + cellId });
            cellId++;
			col1.appendTo(row);
		}
	}
	console.log("TTTTT:"+divTable.html());
	divTable.appendTo("#box");	       
  
};

function writeComment() {
	console.log("Write");
};

function createTableElement(element, elStyle) {

    tableElement = '<div class="card"><div class="card-header"><div class="row"><div class="col-lg-6"><label>' + element.name + '</label></div></div></div>' +
		'<div class="card-body"><div class="row"><div class="col-lg-6"><label>' + element.email + '</label></div></div>' +
		'<div class="row"><div class="col-lg-6"><label>' + element.comment + '</label></div></div></div></div>';

    return tableElement;
};