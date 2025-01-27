async function fetchMarks() {
  const apiUrl = 'http://localhost:8080/api/marks/fetchMarks'; 
  try {
    const response = await fetch(apiUrl); 
    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }
    const marks = await response.json(); 
    populateTable(marks); 
  } catch (error) {
    console.error('Error fetching marks:', error);
    alert('Failed to fetch marks. Please check the console for details.');
  }
}


function populateTable(marks) {
  const tableBody = document.querySelector('#marks-table tbody');
  tableBody.innerHTML = ''; 

  
  marks.forEach(mark => {
    const row = document.createElement('tr');
    row.innerHTML = `
      <td>${mark.studentName}</td>
      <td>${mark.subjectName}</td>
      <td>${mark.marks}</td>
    `;
    tableBody.appendChild(row);
  });
}


document.getElementById('fetch-btn').addEventListener('click', fetchMarks);
