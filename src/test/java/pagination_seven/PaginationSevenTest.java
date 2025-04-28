package pagination_seven;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PaginationSevenTest {
    @Test
    void givenTwoPages_whenOnFirstPage_thenFirstPageIsCurrentPage() {
        PaginationSeven paginationSeven = new PaginationSeven(2, 1);

        String expectedPagination = paginationSeven.displayPagination();

        assertThat(expectedPagination).isEqualTo("(1) 2");
    }

    @Test
    void givenFivePages_whenOnFirstPage_thenFirstPageIsCurrentPage() {
        assertThat(new PaginationSeven(5, 1).displayPagination()).isEqualTo("(1) 2 3 4 5");
    }

    @Test
    void givenFivePages_whenOnLastPage_thenLastPageIsCurrentPage() {
        assertThat(new PaginationSeven(5, 5).displayPagination()).isEqualTo("1 2 3 4 (5)");
    }
}
