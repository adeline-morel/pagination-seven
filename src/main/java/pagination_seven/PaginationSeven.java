package pagination_seven;

public record PaginationSeven(int numberOfPages, int displayedPage) {

    public String displayPagination() {

        StringBuilder builder = new StringBuilder();

        formatPages(builder);

        return builder.toString();
    }

    private void formatPages(StringBuilder builder) {
        for (int i = 1; i <= numberOfPages; i++) {

            String currentPage = String.valueOf(i);

            if (i == displayedPage) {
                builder.append("(").append(currentPage).append(")");
            } else {
                builder.append(currentPage);
            }

            if (i < numberOfPages) {
                builder.append(" ");
            }
        }
    }
}
