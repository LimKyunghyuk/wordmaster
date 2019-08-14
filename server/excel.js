// https://nicgoon.tistory.com/181
var XLSX = require('xlsx');

var workbook = XLSX.readFile('sample.xlsx');

var firstWSheetName = workbook.SheetNames[0];
var firstWSeet = workbook.Sheets[firstWSheetName];

console.log(firstWSeet['A1'].v);