document.addEventListener('DOMContentLoaded', () => {
    const searchForm = document.getElementById('search-form');

    searchForm.addEventListener('submit', (event) => {
        event.preventDefault();
        const formData = new FormData(searchForm);
        const searchParams = new URLSearchParams();

        for (const pair of formData.entries()) {
            searchParams.append(pair[0], pair[1]);
        }

        console.log(`Search Params: ${searchParams.toString()}`);
        alert(`Search Params: ${searchParams.toString()}`);
    });
});